// This file contains the logic for fetching data from a public API and handling errors.

async function fetchData() {
    const apiUrl = 'https://jsonplaceholder.typicode.com/posts'; // Example API URL
    try {
        const response = await fetch(apiUrl);
        if (!response.ok) {
            throw new Error('Network response was not ok ' + response.statusText);
        }
        const data = await response.json();
        displayData(data);
    } catch (error) {
        handleError(error);
    }
}

function displayData(data) {
    const dataContainer = document.getElementById('data-container');
    dataContainer.innerHTML = ''; // Clear previous data
    data.forEach(item => {
        const postElement = document.createElement('div');
        postElement.classList.add('post');
        postElement.innerHTML = `
            <h2>${item.title}</h2>
            <p>${item.body}</p>
        `;
        dataContainer.appendChild(postElement);
    });
}

function handleError(error) {
    const errorContainer = document.getElementById('error-container');
    errorContainer.innerHTML = `<p>Error: ${error.message}</p>`;
}

// Call fetchData when the page loads
document.addEventListener('DOMContentLoaded', async () => {
    const apiDataDiv = document.getElementById('api-data');
    if (!apiDataDiv) return;

    try {
        const response = await fetch('https://jsonplaceholder.typicode.com/posts?_limit=5');
        if (!response.ok) throw new Error('Failed to fetch posts.');
        const posts = await response.json();

        apiDataDiv.innerHTML = posts.map(post => `
            <div class="api-item">
                <strong>${post.title}</strong>
                <p>${post.body}</p>
            </div>
        `).join('');
    } catch (error) {
        apiDataDiv.innerHTML = `<div class="error">Sorry, we couldn't load posts. Please try again later.</div>`;
    }
});

// Fetch a random dog image when the page loads
document.addEventListener('DOMContentLoaded', async () => {
    const dogImageContainer = document.getElementById('dog-image-container');
    if (dogImageContainer) {
        try {
            const response = await fetch('https://dog.ceo/api/breeds/image/random');
            if (!response.ok) throw new Error('Failed to fetch dog image.');
            const data = await response.json();
            dogImageContainer.innerHTML = `
                <img src="${data.message}" alt="Random Dog" style="max-width:100%;border-radius:12px;box-shadow:0 2px 8px #ccc;">
            `;
        } catch (error) {
            dogImageContainer.innerHTML = `<div class="error">Sorry, couldn't load a dog image. Please try again later.</div>`;
        }
    }
});